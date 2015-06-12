# Remove libav as it has LICENSE_FLAG commmerical
PACKAGECONFIG_remove = "libav"

# Camera cannot work with libv4l
EXTRA_OECMAKE += "-DWITH_LIBV4L=OFF \
"
