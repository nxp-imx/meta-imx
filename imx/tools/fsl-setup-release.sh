#!/bin/sh
#
# FSL Build Enviroment Setup Script
#
# Copyright (C) 2011-2013 Freescale Semiconductor
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

    unset CWD BUILD_DIR BACKEND DIST_FEATURES_remove DIST_FEATURES_add
    unset fsl_setup_help fsl_setup_error fsl_setup_flag
    unset usage clean_up
    unset ARM_DIR META_FSL_BSP_RELEASE
    exit_message clean_up
}

# get command line options
OLD_OPTIND=$OPTIND
while getopts "k:r:t:b:e:gh" fsl_setup_flag
do
    case $fsl_setup_flag in
        b) BUILD_DIR="$OPTARG";
           echo -e "\n Build directory is " $BUILD_DIR
           ;;
        e)
            BACKEND="$OPTARG"
            unset DIST_FEATURES_add
            unset DIST_FEATURES_remove
            if [ "$BACKEND" = "fb" ]; then
                DIST_FEATURES_remove="x11 wayland directfb "
                echo -e "\n Using FB backend with FB DIST_FEATURES to override poky X11 DIST FEATURES"
            elif [ "$BACKEND" = "dfb" ]; then
                DIST_FEATURES_remove="x11 wayland "
                DIST_FEATURES_add=" directfb "
                echo -e "\n Using DirectFB backend with DirectFB DIST_FEATURES to override poky X11 DIST FEATURES"
            elif [ "$BACKEND" = "wayland" ]; then
                DIST_FEATURES_remove="x11 directfb "
            elif [ "$BACKEND" = "x11" ]; then
                echo -e  "\n Using X11 backend with poky DIST_FEATURES"
            else
                echo -e "\n Invalid backend specified - use fb, dfb, wayland, or x11"
                fsl_setup_error='true'
            fi
           ;;
        h) fsl_setup_help='true';
           ;;
        ?) fsl_setup_error='true';
           ;;
    esac
done
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
cp sources/meta-fsl-bsp-release/imx/meta-fsl-arm/conf/machine/* sources/meta-fsl-arm/conf/machine

# Set up the basic yocto environment
MACHINE=$MACHINE source $PROGNAME $BUILD_DIR

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

# set mesa preferred provider in case of FB or wayland backends
if [ "$BACKEND" = "fb" ] || [ "$BACKEND" = "wayland" ]; then
     echo "PREFERRED_PROVIDER_virtual/mesa = \"\"" >> $BUILD_DIR/conf/local.conf
fi

META_FSL_BSP_RELEASE="${CWD}/sources/meta-fsl-bsp-release/imx/meta-fsl-arm"
echo "##Freescale Yocto Release layer" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-fsl-bsp-release/imx/meta-fsl-arm \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-fsl-bsp-release/imx/meta-fsl-demos \"" >> $BUILD_DIR/conf/bblayers.conf

echo "BBLAYERS += \" \${BSPDIR}/sources/meta-browser \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-gnome \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-networking \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-python \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-openembedded/meta-ruby \"" >> $BUILD_DIR/conf/bblayers.conf

echo "BBLAYERS += \" \${BSPDIR}/sources/meta-qt5 \"" >> $BUILD_DIR/conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-fsl-bsp-release/imx/meta-fsl-qt5 \"" >> $BUILD_DIR/conf/bblayers.conf


echo >> $BUILD_DIR/conf/local.conf

if [ "$BACKEND" = "fb" ] || [ "$BACKEND" = "wayland" ] || [ "$BACKEND" = "dfb" ]  ; then
    echo "DISTRO_FEATURES_remove = \"$DIST_FEATURES_remove\"" >> $BUILD_DIR/conf/local.conf
    if [ !  -z "$DIST_FEATURES_add" ] ; then
        echo "DISTRO_FEATURES_append = \"$DIST_FEATURES_add\"" >> $BUILD_DIR/conf/local.conf
    fi
    echo >> $BUILD_DIR/conf/local.conf
fi

cd  $BUILD_DIR
clean_up
