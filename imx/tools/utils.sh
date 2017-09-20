#!/bin/sh

file_override() {
    source_path=$1
    override_root=$2
    if [ -f $source_path ]; then
        override_path=$override_root/`basename $source_path`
        if [ -f $override_path ]; then
            rm $override_path
        fi
    fi
}

machine_overrides() {
    layer=$1
    machines="../sources/$layer/conf/machine/*"
    machine_includes="../sources/$layer/conf/machine/include/*"
    for machine in $machines; do
        file_override $machine ../sources/meta-freescale/conf/machine
    done
    for machine_include in $machine_includes; do
        file_override $machine_include ../sources/meta-freescale/conf/machine/include
    done
}

bbclass_overrides() {
    layer=$1
    bbclasses="../sources/$layer/classes/*"
    for bbclass in $bbclasses; do
        file_override $bbclass ../sources/meta-freescale/classes
    done
}

# hook_in_layer
#
# Adds the specified layer $1 to bblayers.conf. Also takes care of
# any machine and/or bbclass files in the layer that are overriding a
# file in meta-freescale. The function is expected to be called
# from the build folder.
#
# The specified layer is defined as the path from the sources folder
# to the layer folder.
#
# Example:
#   hook_in_layer meta-fsl-bsp-release/imx/meta-bsp
hook_in_layer() {
    layer=$1
    echo "BBLAYERS += \" \${BSPDIR}/sources/$layer \"" >> conf/bblayers.conf
    machine_overrides $layer
    bbclass_overrides $layer
}
