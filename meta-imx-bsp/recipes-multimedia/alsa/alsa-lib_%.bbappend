# override meta-freescale/recipes-multimedia/alsa/alsa-lib_%.bbappend
GLIBC_64BIT_TIME_FLAGS:arm:imx-nxp-bsp = " -D_TIME_BITS=64 -D_FILE_OFFSET_BITS=64"
