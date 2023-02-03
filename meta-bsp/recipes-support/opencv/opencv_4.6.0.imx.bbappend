SRCREV_opencv = "98c1567914d53d17d82fd6b78a0106cf6e175db2"

PACKAGECONFIG:append:mx9-nxp-bsp = " dnn text"

PACKAGECONFIG_OPENCL:mx8mnul-nxp-bsp = ""
PACKAGECONFIG_OPENCL:mx8mpul-nxp-bsp = ""

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
