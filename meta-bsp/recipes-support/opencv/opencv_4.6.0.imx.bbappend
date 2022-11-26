SRCREV_opencv = "d3440df40a6e90cd1d2a1b729bcbc16aa4d42f5d"

PACKAGECONFIG:append:mx9-nxp-bsp = " dnn text"

PACKAGECONFIG_OPENCL:mx8mnul-nxp-bsp = ""
PACKAGECONFIG_OPENCL:mx8mpul-nxp-bsp = ""

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
