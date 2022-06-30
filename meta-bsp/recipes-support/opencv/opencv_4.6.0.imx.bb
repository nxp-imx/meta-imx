require recipes-support/opencv/opencv_4.5.2.imx.bb

SRCBRANCH = "4.6.0_imx"
SRCREV_opencv = "d3440df40a6e90cd1d2a1b729bcbc16aa4d42f5d"
SRCREV_contrib = "db16caf6ceee76b43b94c846be276e92a43e9700"
SRCREV_extra = "936854e2b666853d6d0732a8eabc2d699f4fa3d8"
SRC_URI:remove = " \
    file://0001-Use-the-one-argument-version-of-SetTotalBytesLimit.patch \
"

PACKAGECONFIG[qt6] = "-DWITH_QT=ON -DQT_HOST_PATH=${RECIPE_SYSROOT_NATIVE}${prefix_native},-DWITH_QT=OFF,qtbase qtbase-native,"

PACKAGECONFIG_OPENCL:mx8mnul-nxp-bsp = ""
PACKAGECONFIG_OPENCL:mx8mpul-nxp-bsp = ""
