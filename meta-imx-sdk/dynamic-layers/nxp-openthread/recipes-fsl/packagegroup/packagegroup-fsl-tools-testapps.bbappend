# Add needed Freescale packages and definitions

# Install openthread related tools
NXP_OPENTHREAD_TOOLS ?= ""
NXP_OPENTHREAD_TOOLS:imx-nxp-bsp = " \
    packagegroup-nxp-openthread \
"

RDEPENDS:${PN} += " \
    ${NXP_OPENTHREAD_TOOLS} \
"
