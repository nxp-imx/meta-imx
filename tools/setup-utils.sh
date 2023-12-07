#!/bin/sh
#
# FSL Build Environment Setup Utility Functions
#
# Copyright 2017 NXP
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

file_override() {
    source_path=$1
    override_root=$2
    if [ -f $source_path ]; then
        override_path=$override_root/`basename $source_path`
        if [ -f $override_path ]; then
            echo "\

WARNING: The file '$PWD/$source_path' is replacing the upstream file '$PWD/$override_path'. \
Overrides by file replacement are error-prone and discouraged. Please find an \
alternative override mechanism that uses meta-data only.
"
            rm $override_path
        fi
    fi
}

machine_overrides() {
    layer=$1
    upstream_layer=$2
    machines="../sources/$layer/conf/machine/*"
    machine_includes="../sources/$layer/conf/machine/include/*"
    for machine in $machines; do
        file_override $machine ../sources/$upstream_layer/conf/machine
    done
    for machine_include in $machine_includes; do
        file_override $machine_include ../sources/$upstream_layer/conf/machine/include
    done
}

bbclass_overrides() {
    layer=$1
    upstream_layer=$2
    bbclasses="../sources/$layer/classes/*"
    for bbclass in $bbclasses; do
        file_override $bbclass ../sources/$upstream_layer/classes
    done
}

# hook_in_layer LAYER-NAME [UPSTREAM-LAYER-NAME]...
#
# Adds the specified layer to bblayers.conf and facilitates
# the replacement of upstream machine and/or bbclass files by
# removing upstream files with the same name.
#
# WARNING: Overrides by file replacement are error-prone and
# discouraged, and each such override will be marked with a
# warning message. Please find an alternative override using
# meta-data only.
#
# If no upstream layer is specified, meta-freescale is used.
#
# The function is expected to be called from the build folder.
#
# The specified layer is defined as the path from the sources folder
# to the layer folder.
#
# Example:
#   hook_in_layer meta-imx/meta-imx-bsp
hook_in_layer() {

    layer=$1
    shift
    if [ "$1" = "" ]; then
        upstream_layers="meta-freescale"
    else
        upstream_layers="$@"
    fi

    echo "BBLAYERS += \"\${BSPDIR}/sources/$layer\"" >> conf/bblayers.conf
    for upstream_layer in $upstream_layers; do
        machine_overrides $layer $upstream_layer
        bbclass_overrides $layer $upstream_layer
    done
}
