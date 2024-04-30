FILESEXTRAPATHS:prepend := "${THISDIR}/mesa:"

SRC_URI:append:mx93-nxp-bsp = " file://0001-MGS-7673-egl-dri2-fix-video-showing-wrong-frame.patch"
SRC_URI:append:imx-nxp-bsp  = " file://0001-MGS-7599-cso-fix-virgl-driver-assert-issue.patch"
