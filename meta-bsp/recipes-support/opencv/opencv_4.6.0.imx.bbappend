SRCREV_opencv = "47a0a1553d1b2885e558afb9478676a5f2bcf4d7"

PACKAGECONFIG:append:mx9-nxp-bsp = " dnn text"

PACKAGECONFIG_OPENCL:mx8mnul-nxp-bsp = ""
PACKAGECONFIG_OPENCL:mx8mpul-nxp-bsp = ""

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
