#!/bin/sh
#
# FSL Build Enviroment Setup Script
#
# Copyright (C) 2011-2015 Freescale Semiconductor
#
# This program is free software; you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation; either version 2 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program; if not, write to the Free Software
# Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

CWD=`pwd`
PROGNAME="setup-environment"
exit_message ()
{
   echo "To return to this build environment later please run:"
   echo "    source setup-environment <build_dir>"

}

usage()
{
    echo -e "\nUsage: source fsl-setup-release.sh
    Optional parameters: [-b build-dir] [-e back-end] [-h]"
echo "
    * [-b build-dir]: Build directory, if unspecified script uses 'build' as output directory
    * [-e back-end]: Options are 'fb', 'dfb', 'x11, 'wayland'
    * [-h]: help
"
}


clean_up()
{

    unset CWD BUILD_DIR BACKEND FSLDISTRO
    unset fsl_setup_help fsl_setup_error fsl_setup_flag
    unset usage clean_up
    unset ARM_DIR META_FSL_BSP_RELEASE
    exit_message clean_up
}

# get command line options
OLD_OPTIND=$OPTIND
unset FSLDISTRO

while getopts "k:r:t:b:e:gh" fsl_setup_flag
do
    case $fsl_setup_flag in
        b) BUILD_DIR="$OPTARG";
           echo -e "\n Build directory is " $BUILD_DIR
           ;;
        e)
            # Determine what distro needs to be used.
            BACKEND="$OPTARG"
            if [ "$BACKEND" = "fb" ]; then
                if [ -z "$DISTRO" ]; then
                    FSLDISTRO='fsl-imx-fb'
                    echo -e "\n Using FB backend with FB DIST_FEATURES to override poky X11 DIST FEATURES"
                elif [ ! "$DISTRO" = "fsl-imx-fb" ]; then
                    echo -e "\n DISTRO specified conflicts with -e. Please use just one or the other."
                    fsl_setup_error='true'
                fi

            elif [ "$BACKEND" = "dfb" ]; then
                if [ -z "$DISTRO" ]; then
                    FSLDISTRO='fsl-imx-dfb'
                    echo -e "\n Using DirectFB backend with DirectFB DIST_FEATURES to override poky X11 DIST FEATURES"
                elif [ ! "$DISTRO" = "fsl-imx-dfb" ]; then
                    echo -e "\n DISTRO specified conflicts with -e. Please use just one or the other."
                    fsl_setup_error='true'
                fi

            elif [ "$BACKEND" = "wayland" ]; then
                if [ -z "$DISTRO" ]; then
                    FSLDISTRO='fsl-imx-wayland'
                    echo -e "\n Using Wayland backend."
                elif [ ! "$DISTRO" = "fsl-imx-wayland" ]; then
                    echo -e "\n DISTRO specified conflicts with -e. Please use just one or the other."
                    fsl_setup_error='true'
                fi

            elif [ "$BACKEND" = "x11" ]; then
                if [ -z "$DISTRO" ]; then
                    FSLDISTRO='fsl-imx-x11'
                    echo -e  "\n Using X11 backend with poky DIST_FEATURES"
                elif [ ! "$DISTRO" = "fsl-imx-x11" ]; then
                    echo -e "\n DISTRO specified conflicts with -e. Please use just one or the other."
                    fsl_setup_error='true'
                fi

            else
                echo -e "\n Invalid backend specified with -e.  Use fb, dfb, wayland, or x11"
                fsl_setup_error='true'
            fi
           ;;
        h) fsl_setup_help='true';
           ;;
        ?) fsl_setup_error='true';
           ;;
    esac
done


if [ -z "$DISTRO" ]; then
    if [ -z "$FSLDISTRO" ]; then
        FSLDISTRO='fsl-imx-x11'
    fi
else
    FSLDISTRO="$DISTRO"
fi

OPTIND=$OLD_OPTIND

# check the "-h" and other not supported options
if test $fsl_setup_error || test $fsl_setup_help; then
    usage && clean_up && return 1
fi

if [ -z "$BUILD_DIR" ]; then
    BUILD_DIR='build'
fi

if [ -z "$MACHINE" ]; then
    echo setting to default machine
    MACHINE='imx6qsabresd'
fi

# New machine definitions may need to be added to the expected location
if [ -d ./sources/meta-freescale ]; then
   cp -r sources/meta-fsl-bsp-release/imx/meta-bsp/conf/machine/* sources/meta-freescale/conf/machine
else
   cp -r sources/meta-fsl-bsp-release/imx/meta-bsp/conf/machine/* sources/meta-fsl-arm/conf/machine
fi

# copy new EULA into community so setup uses latest i.MX EULA
if [ -d ./sources/meta-freescale ]; then
   cp sources/meta-fsl-bsp-release/imx/EULA.txt sources/meta-freescale/EULA
else
   cp sources/meta-fsl-bsp-release/imx/EULA.txt sources/meta-fsl-arm/EULA
fi

# copy unpack class with md5sum that matches new EULA
if [ -d ./sources/meta-freescale ]; then
   cp sources/meta-fsl-bsp-release/imx/classes/fsl-eula-unpack.bbclass sources/meta-freescale/classes
else
   cp sources/meta-fsl-bsp-release/imx/classes/fsl-eula-unpack.bbclass sources/meta-fsl-arm/classes
fi

# Set up the basic yocto environment
if [ -z "$DISTRO" ]; then
   DISTRO=$FSLDISTRO MACHINE=$MACHINE . ./$PROGNAME $BUILD_DIR
else
   MACHINE=$MACHINE . ./$PROGNAME $BUILD_DIR
fi

# Point to the current directory since the last command changed the directory to $BUILD_DIR
BUILD_DIR=.

if [ ! -e $BUILD_DIR/conf/local.conf ]; then
    echo -e "\n ERROR - No build directory is set yet. Run the 'setup-environment' script before running this script to create " $BUILD_DIR
    echo -e "\n"
    return 1
fi

# On the first script run, backup the local.conf file
# Consecutive runs, it restores the backup and changes are appended on this one.
if [ ! -e $BUILD_DIR/conf/local.conf.org ]; then
    cp $BUILD_DIR/conf/local.conf $BUILD_DIR/conf/local.conf.org
else
    cp $BUILD_DIR/conf/local.conf.org $BUILD_DIR/conf/local.conf
fi


if [ ! -e $BUILD_DIR/conf/bblayers.conf.org ]; then
    cp $BUILD_DIR/conf/bblayers.conf $BUILD_DIR/conf/bblayers.conf.org
else
    cp $BUILD_DIR/conf/bblayers.conf.org $BUILD_DIR/conf/bblayers.conf
fi


META_FSL_BSP_RELEASE="${CWD}/sources/meta-fsl-bsp-release/imx/meta-bsp"
echo "##Freescale Yocto Project Release layer" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-fsl-bsp-release/imx/meta-bsp \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-fsl-bsp-release/imx/meta-sdk \"" >> $BUILD_DIR/conf/bblayers.conf

echo "BBLAYERS += \" \${BSPDIR}/sources/meta-browser \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-gnome \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-networking \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-python \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-ruby \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-filesystems \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-xfce \"" >> $BUILD_DIR/conf/bblayers.conf

echo "BBLAYERS += \" \${BSPDIR}/sources/meta-qt5 \"" >> $BUILD_DIR/conf/bblayers.conf

echo BSPDIR=$BSPDIR
echo BUILD_DIR=$BUILD_DIR

# Support integrating community meta-freescale instead of meta-fsl-arm
if [ -d ../sources/meta-freescale ]; then
    echo meta-freescale directory found
    # Change settings according to environment
    sed -e "s,meta-fsl-arm\s,meta-freescale ,g" -i conf/bblayers.conf
    sed -e "s,\$.BSPDIR./sources/meta-fsl-arm-extra\s,,g" -i conf/bblayers.conf
fi

cd  $BUILD_DIR
clean_up
unset FSLDISTRO
