# Remove libav as it has LICENSE_FLAG commmerical
PACKAGECONFIG_remove = "libav"

# Camera cannot work with libv4l
EXTRA_OECMAKE += "-DWITH_LIBV4L=OFF \
"
# Revert PACKAGECONFIG_remove_mx6 = "v4l" in meta-fsl-arm layer,
# or the camera cannot work on imx6 platfrom
PACKAGECONFIG_append_mx6 = " v4l"
