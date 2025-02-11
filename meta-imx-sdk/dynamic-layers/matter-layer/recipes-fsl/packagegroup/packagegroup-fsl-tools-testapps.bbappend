# Add needed Freescale packages and definitions

# Install matter related tools
NXP_MATTER_TOOLS ?= ""

RDEPENDS:${PN} += " \
    ${NXP_MATTER_TOOLS} \
"
