# Undo customization in meta-freescale that doesn't apply to 8DXL
PACKAGECONFIG_remove_mx8dxl = "osmesa"
DRIDRIVERS_remove_mx8dxl = "swrast"
PACKAGECONFIG_remove_mx8phantomdxl = "osmesa"
DRIDRIVERS_remove_mx8phantomdxl = "swrast"

do_install_append_imxgpu3d () {
    rm -f ${D}${includedir}/GL/glcorearb.h
}
