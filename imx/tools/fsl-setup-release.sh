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

usage()
{
    echo -e "\nUsage: source ${BASH_SOURCE[0]} <-m machine>
    Optional parameters: [-j jobs] [-t tasks] [-p] [-h]"
    if [ -e "$META_FSL_ARM_LAYER_PATH" ]; then
        echo -e -n "\n    Supported arm machines: `ls ${META_FSL_ARM_LAYER_PATH}/conf/machine \
        | grep -v "^include" | sed s/\.conf//g | xargs echo`"
    fi
echo "
    * [-j jobs]:  number of jobs for make to spawn during the compilation stage.
    * [-t tasks]: number of BitBake tasks that can be issued in parallel.
    * [-k version]:  Specify preferred kernel version
    * [-g tag]:   Specify a tag to build from
    * [-r release]  This is the release version so for 3.0.35 would be 3.0.35_4.0.0 (would be 4.0.0)
    * [-d path]:  non-default DL_DIR path (download dir)
    * [-b path]:  non-default build dir location
    * [-s path]:  append an extra path to build_machine_release folder
    * [-l]:       lite mode. To help conserve disk space, deletes the building
                  directory once the package is built.
    * [-p ]:      Build from internal git - for Freescale Development team only
    * [-h]:       help
"
}

exit_message ()
{
    echo "Run the following commands to start a build:"
    local i=''

    if [[ "${BOARD}" =~ "imx" ]]; then
        if [ -e "${META_FSL_MULTIMEDIA_LAYER_PATH}" ]; then
            for i in `find ${META_FSL_MULTIMEDIA_LAYER_PATH}/ -name "fsl-image-*.bb"`;do
            i=${i##*/};i=${i%.bb};
                echo "    bitbake $i";
            done
        fi
    fi

   echo "To return to this build environment later please run:"
   echo "    source setup-environment build"
}

clean_up()
{
    unset ARM_DIR META_FSL_MULTIMEDIA_LAYER_PATH META_FSL_ARM_LAYER_PATH META_FSL_BSP_RELEASE
    unset fsl_setup_j fsl_setup_t fsl_setup_help fsl_setup_error
    unset fsl_setup_lite fsl_setup_flag SKIP_CONFIG OPTIND OLD_OPTIND VALID_BOARD
    unset fsl_private_build BOARD JOBS THREADS exit_message usage clean_up
    unset fsl_setup_extra_path fsl_setup_build_path fsl_setup_dl_path
    unset ARM_BOARD ARCH fsl_preferred_version fsl_release_tag  fsl_release_tag_set
    unset EULA fsl_kernel_version fsl_release_version fsl_release_version_set
}

# ARM_DIR is the directory that script fsl_setup exists
ARM_DIR=`readlink -f ${BASH_SOURCE[0]}`
ARM_DIR=`dirname $ARM_DIR`

META_FSL_MULTIMEDIA_LAYER_PATH="${ARM_DIR}/sources/meta-fsl-demos"
META_FSL_ARM_LAYER_PATH="${ARM_DIR}/sources/meta-fsl-arm"

if [ -z "$ZSH_NAME" ] && [ "$0" = "${BASH_SOURCE[0]}" ]; then
    echo "Error: This script needs to be sourced."
    usage && exit 1
fi

# get command line options
OLD_OPTIND=$OPTIND
while getopts "m:k:r:g:j:t:ph" fsl_setup_flag
do
    case $fsl_setup_flag in
        m) BOARD="$OPTARG";
           ;;
        j) fsl_setup_j="$OPTARG";
           ;;
        t) fsl_setup_t="$OPTARG";
           ;;
        k) fsl_preferred_version="$OPTARG";
           ;;
        r) fsl_release_version="$OPTARG"; fsl_release_version_set='true';
           ;;
        p) fsl_private_build='true';
           ;;
        g) fsl_release_tag="$OPTARG"; fsl_release_tag_set='true'; 
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

# Check board correction
if [ -e "$META_FSL_ARM_LAYER_PATH" ]; then
    ARM_BOARD=`ls ${META_FSL_ARM_LAYER_PATH}/conf/machine`
fi
VALID_BOARD=`echo -e "$ARM_BOARD" | grep ${BOARD}.conf$ | wc -l`
if [ "x$BOARD" = "x" ] || [ "$VALID_BOARD" = "0" ]; then
    echo "Invalid board type!"
    usage && clean_up
    return 1
else
    echo "Configuring for ${BOARD} board type"
fi

# set default jobs and threads
JOBS="2"
THREADS="2"
# Validate optional jobs and threads
if [ -n "$fsl_setup_j" ] && [[ "$fsl_setup_j" =~ ^[0-9]+$ ]]; then
    JOBS=$fsl_setup_j
fi
if [ -n "$fsl_setup_t" ] && [[ "$fsl_setup_t" =~ ^[0-9]+$ ]]; then
    THREADS=$fsl_setup_t
fi

# setup all configurable items: mirrors, dl_dir, sscache dir, machine, etc
# setup machine type
echo >> build/conf/local.conf
echo "# Machine Selection" >> build/conf/local.conf
echo "MACHINE = \"${BOARD}\"" >> build/conf/local.conf
echo >> build/conf/local.conf

# setup parallel jobs and tasks
echo "# Parallelism Options" >> build/conf/local.conf
echo "BB_NUMBER_THREADS = \"$THREADS\"" >> build/conf/local.conf
echo "PARALLEL_MAKE = \"-j $JOBS\"" >> build/conf/local.conf
echo >> build/conf/local.conf


if [[ "${BOARD}" =~ "imx" ]]; then

    META_FSL_BSP_RELEASE="${ARM_DIR}/sources/meta-fsl-bsp-release/imx"
    echo "##Add in Freescale release layer" >> build/conf/bblayers.conf
    echo "BBLAYERS += \"${META_FSL_BSP_RELEASE}\"" >> build/conf/bblayers.conf

    if [ ! -z "$fsl_private_build" ];then
       export ftp_proxy="wwwgate0.freescale.net:1080/"
       # setup internal build servers
       echo "# Internal Build servers" >> build/conf/local.conf
       echo "FSL_ARM_GIT_SERVER = \"sw-git.freescale.net\"" >> build/conf/local.conf
       echo >> build/conf/local.conf

       # setup Build from Tip
       echo "# Freescale Tag " >> build/conf/local.conf
       echo "FSL_ARM_RELEASE_TAG = \"\${AUTOREV}\"" >> build/conf/local.conf
       echo >> build/conf/local.conf

       if [ ! -z "$fsl_release_tag_set" ];then
            echo "# Freescale Tag " >> build/conf/local.conf
            echo "FSL_ARM_BRANCH_TAG = \"tag\"" >> build/conf/local.conf
            echo "FSL_ARM_GIT_TAGBRANCH = \"$fsl_release_tag\"" >> build/conf/local.conf
            echo "FSL_ARM_GIT_VERSION = \"\"" >> build/conf/local.conf
            echo "FSL_ARM_VERSION_GIT_TAGBRANCH = \"$fsl_release_tag\"" >> build/conf/local.conf
            echo >> build/conf/local.conf
       else
           # setup Build from Branch
           echo "# Freescale Branch " >> build/conf/local.conf
           echo "FSL_ARM_BRANCH_TAG = \"branch\"" >> build/conf/local.conf
           echo "FSL_ARM_GIT_TAGBRANCH = \"imx_$fsl_preferred_version\"" >> build/conf/local.conf
           if [ ! -z "$fsl_release_version_set" ] ; then
               echo "FSL_ARM_GIT_VERSION = \"_$fsl_release_version\"" >> build/conf/local.conf
               echo "FSL_ARM_VERSION_GIT_TAGBRANCH = \"imx_$fsl_preferred_version\"" >> build/conf/local.conf
           else
               echo "FSL_ARM_GIT_VERSION = \"\"" >> build/conf/local.conf
               echo "FSL_ARM_VERSION_GIT_TAGBRANCH = \"master\"" >> build/conf/local.conf
           fi
           echo >> build/conf/local.conf
       fi

        echo "# Preferred Versions" >> build/conf/local.conf
        echo "PREFERRED_VERSION_linux-imx = \"$fsl_preferred_version\"" >> build/conf/local.conf
        echo >> build/conf/local.conf
    else
       # setup external build servers
       echo "# Freescale Build servers" >> build/conf/local.conf
       echo "FSL_ARM_GIT_SERVER = \"git.freescale.com/imx\"" >> build/conf/local.conf
       echo >> build/conf/local.conf

       # setup Build from Tag
       echo "# Freescale Tag " >> build/conf/local.conf
       #### Change AUTOREV to tag for release
       echo "FSL_ARM_RELEASE_TAG = \"\${AUTOREV}\"" >> build/conf/local.conf
       echo >> build/conf/local.conf

       # setup Build from Tag if tag is specified
       ### Change branch=<> to tag=<>
       if [ ! -z "$fsl_release_tag_set" ] ; then
            echo "# Freescale Tag " >> build/conf/local.conf
            echo "FSL_ARM_BRANCH_TAG = \"tag\"" >> build/conf/local.conf
            echo "FSL_ARM_GIT_TAGBRANCH = \"$fsl_release_tag\"" >> build/conf/local.conf
            echo >> build/conf/local.conf
            echo "FSL_ARM_GIT_VERSION = \"\"" >> build/conf/local.conf
       elif [ ! -z "$fsl_release_version" ] ; then
            echo "FSL_ARM_GIT_VERSION = \"_$fsl_release_version\"" >> build/conf/local.conf
       else
            echo "FSL_ARM_GIT_VERSION = \"\"" >> build/conf/local.conf
       fi

       echo "# Preferred Version"
       echo "PREFERRED_VERSION_linux-imx = \"$fsl_preferred_version\"" >> build/conf/local.conf
       echo >> build/conf/local.conf
    fi
fi

exit_message
cd build
clean_up
