# Add needed Freescale packages and definitions

# Install matter related tools
NXP_MATTER_TOOLS ?= ""
NXP_MATTER_TOOLS:imx-nxp-bsp = " \
    packagegroup-nxp-matter-baseline \
"

RDEPENDS:${PN} += " \
    ${NXP_MATTER_TOOLS} \
"
