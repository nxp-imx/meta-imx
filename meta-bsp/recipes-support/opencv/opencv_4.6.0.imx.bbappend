SRCREV_opencv = "2d6bcde367a9ff4559ad06ace5e55380293fbab0"

PACKAGECONFIG:append:mx9-nxp-bsp = " dnn text"

PACKAGECONFIG_OPENCL:mx8mnul-nxp-bsp = ""
PACKAGECONFIG_OPENCL:mx8mpul-nxp-bsp = ""

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
