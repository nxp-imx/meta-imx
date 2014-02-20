#!/bin/sh
#
# QT5 Setup Script for Framebuffer and Wayland
#
# Copyright (C) 2014 Freescale Semiconductor
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
#
#----------------------------------------------------------------
# This script setups builds QT5 for framebuffer and Wayland with
# Weston Compositor backends.  Use this for evaluation only.
# QT5 has not been fully tested by Freescale.
# Do not use this for X11 and DirectFB backends
#----------------------------------------------------------------
#
#
CWD=`pwd`

usage()
{
    echo -e "\nUsage: source $PROGNAME Optional parameters: [-e back-end] "
    echo " * [-e back-end]: Options are 'fb', 'dfb', 'x11, 'wayland'"
}


clean_up()
{

    unset CWD BUILD_DIR BACKEND DIST_FEATURES_remove DIST_FEATURES_add
    unset fsl_setup_help fsl_setup_error fsl_setup_flag
    unset usage clean_up
}


# get command line options
OLD_OPTIND=$OPTIND
while getopts "k:r:t:b:e:gh" fsl_setup_flag
do
    case $fsl_setup_flag in
         e)
            BACKEND="$OPTARG"
            if [ "$BACKEND" = "fb" ] || [ "$BACKEND" = "wayland" ] ; then
              echo "DIST_FEATURES_add = \" qt5 \"" >> conf/local.conf
            else
                echo -e "\n Backend not supported for QT5"
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

# Add meta-qt5 layer to BBLAYERS
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-qt5 \"" >> conf/bblayers.conf

# Update distro featues for QT5
if [ "$BACKEND" = "fb" ] || [ "$BACKEND" = "wayland" ]; then
    # Use Qt5 eglfs plugin for accelerated graphics using the framebuffer
    echo "CORE_IMAGE_EXTRA_INSTALL = \" tslib icu qtbase qtbase-fonts qtbase-plugins qtbase-examples cinematicexperience gstreamer nano cairo pango fontconfig freetype \"" >> conf/local.conf
fi

# Clone and check out meta-qt5 layer
cd ../sources
git clone -b dora https://github.com/meta-qt5/meta-qt5.git
cd $CWD

clean_up

