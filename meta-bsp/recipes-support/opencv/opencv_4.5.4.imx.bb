require opencv-4.5.2.imx.inc

OPENCV_SRC = "git://github.com/nxp-imx/opencv-imx.git;protocol=https;branch=${SRCBRANCH};name=opencv"
SRCBRANCH = "4.5.4_imx"
SRCREV_opencv = "9eb733fe4eadddb30a268d9d186ee5f114b16287"
SRCREV_contrib = "2bc3e1a169afd2675ef68221176f32cc0ea5427a"
SRCREV_extra = "822ee11240b969e98e20546663bc481a5e7089cc"
SRC_URI:remove = " \
    file://0001-Use-the-one-argument-version-of-SetTotalBytesLimit.patch \
"

PACKAGECONFIG_OPENCL:mx8mnul-nxp-bsp = ""
PACKAGECONFIG_OPENCL:mx8mpul-nxp-bsp = ""
