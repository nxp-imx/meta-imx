# OpenCV test apps
OPENCV_TOOLS_INSTALL = ""
OPENCV_TOOLS_INSTALL_imxgpu2d = "opencv-apps opencv-samples"

RDEPENDS_${PN} += " \
    ${OPENCV_TOOLS_INSTALL} \
"
