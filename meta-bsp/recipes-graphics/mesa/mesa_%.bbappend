# Fix meta-freescale for i.MX 8, allowing the switch from gallium to OSMesa
# for DRM only
PACKAGECONFIG_REMOVE        = "osmesa"
PACKAGECONFIG_REMOVE_imxdrm = ""
PACKAGECONFIG_APPEND        = " gallium"
PACKAGECONFIG_APPEND_imxdrm = ""
PACKAGECONFIG_remove = "${PACKAGECONFIG_REMOVE}"
PACKAGECONFIG_append = "${PACKAGECONFIG_APPEND}"

# Fix meta-freescale, don't use swrast at all
DRIDRIVERS_remove = "swrast"
