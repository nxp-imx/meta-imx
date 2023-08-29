OPENCV_SRC = "git://github.com/nxp-imx/opencv-imx.git;protocol=https"
SRCREV_opencv = "5423d53ae0d116ee5bbe52f8b5503f0cd8586998"

# i.MX 8 build includes opencv_extra, add protocol=https;nobranch=1 to fetch
SRC_URI_remove = "git://github.com/opencv/opencv_extra.git;destsuffix=extra;name=extra"
SRC_URI += "git://github.com/opencv/opencv_extra.git;destsuffix=extra;name=extra;protocol=https;nobranch=1"

PACKAGECONFIG_OPENCL_mx8mnul = ""
PACKAGECONFIG_OPENCL_mx8mpul = ""
