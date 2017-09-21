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
# Adds the specified layer to bblayers.conf. Also takes care of
# any machine and/or bbclass files in the layer that are overriding
# files in an upstream layer. If no upstream layer is specified,
# meta-freescale is used. The function is expected to be called
# from the build folder.
#
# The specified layer is defined as the path from the sources folder
# to the layer folder.
#
# Example:
#   hook_in_layer meta-fsl-bsp-release/imx/meta-bsp
hook_in_layer() {

    layer=$1
    shift
    if [ "$1" = "" ]; then
        upstream_layers="meta-freescale"
    else
        upstream_layers="$@"
    fi

    echo "BBLAYERS += \" \${BSPDIR}/sources/$layer \"" >> conf/bblayers.conf
    for upstream_layer in $upstream_layers; do
        machine_overrides $layer $upstream_layer
        bbclass_overrides $layer $upstream_layer
    done
}
