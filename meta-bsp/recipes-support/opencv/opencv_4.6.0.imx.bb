require opencv-4.5.2.imx.inc

OPENCV_SRC = "git://github.com/nxp-imx/opencv-imx.git;protocol=https;branch=${SRCBRANCH};name=opencv"
SRCBRANCH = "4.6.0_imx"
SRCREV_opencv = "d3440df40a6e90cd1d2a1b729bcbc16aa4d42f5d"
SRCREV_contrib = "db16caf6ceee76b43b94c846be276e92a43e9700"
SRCREV_extra = "936854e2b666853d6d0732a8eabc2d699f4fa3d8"
SRC_URI:remove = " \
    file://0001-Use-the-one-argument-version-of-SetTotalBytesLimit.patch \
"
PACKAGECONFIG:append:mx9-nxp-bsp = " dnn text"

PACKAGECONFIG_OPENCL:mx8mnul-nxp-bsp = ""
PACKAGECONFIG_OPENCL:mx8mpul-nxp-bsp = ""

PACKAGECONFIG[qt6] = "-DWITH_QT=ON -DQT_HOST_PATH=${RECIPE_SYSROOT_NATIVE}${prefix_native},-DWITH_QT=OFF,qtbase qtbase-native,"
PACKAGECONFIG[tim-vx] = "-DWITH_TIMVX=ON -DTIMVX_INSTALL_DIR=${STAGING_DIR_HOST}${libdir},-DWITH_TIMVX=OFF,tim-vx"

# Disable cvv module in opencv_contrib as it is not yet suppported for Qt6
EXTRA_OECMAKE:append = " -DBUILD_opencv_cvv=OFF"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
