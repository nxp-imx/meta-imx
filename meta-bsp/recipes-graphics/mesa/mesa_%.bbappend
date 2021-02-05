# For NXP BSP, choose between gallium and osmesa, and between enabling
# dri and swrast or not. gallium and dri are default.
#
# For parts with no GPU, use gallium and dri
PACKAGECONFIG_REMOVE_NXPBSP               = ""
PACKAGECONFIG_APPEND_NXPBSP               = ""
DRIDRIVERS_NXPBSP                         = ""
#
# For parts with GPU but no DRM, use gallium
PACKAGECONFIG_REMOVE_NXPBSP_imxgpu        = "dri"
DRIDRIVERS_NXPBSP_imxgpu                  = ""
#
# For parts with GPU and DRM, use osmesa, dri, and swrast
PACKAGECONFIG_REMOVE_NXPBSP_imxgpu_imxdrm = "gallium"
PACKAGECONFIG_APPEND_NXPBSP_imxgpu_imxdrm = "osmesa"
DRIDRIVERS_NXPBSP_imxgpu_imxdrm           = "swrast"
#
PACKAGECONFIG_remove_use-nxp-bsp = "${PACKAGECONFIG_REMOVE_NXPBSP}"
PACKAGECONFIG_append_use-nxp-bsp = " ${PACKAGECONFIG_APPEND_NXPBSP}"
DRIDRIVERS_use-nxp-bsp           = "${DRIDRIVERS_NXPBSP}"
