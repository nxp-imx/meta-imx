FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Overwrite the bbappend file in meta-fsl-arm layer as v4l can't be removed
SRC_URI_append_mx6sx = " file://0001-MGS-515-ccc-Opencv-app-can-t-run-on-imx6sx-with-cam.patch"

# Remove libav as it has LICENSE_FLAG commmerical
PACKAGECONFIG_remove = "libav"

# Camera cannot work with libv4l
PACKAGECONFIG_remove = "libv4l"
