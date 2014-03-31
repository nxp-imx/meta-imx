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

# Add meta-qt5 layer to BBLAYERS
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-qt5 \"" >> conf/bblayers.conf
echo "BBLAYERS += \" \${BSPDIR}/sources/meta-fsl-bsp-release/imx/meta-fsl-qt5 \"" >> conf/bblayers.conf

# Clone and check out meta-qt5 layer if does not exist
if [ ! -d "../sources/meta-qt5" ]; then
    cd ../sources
    git clone -b master https://github.com/meta-qt5/meta-qt5.git
    cd $CWD
fi

