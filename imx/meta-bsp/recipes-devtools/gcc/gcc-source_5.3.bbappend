FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " file://gcc-5.3.0-fix-regression.patch \
                  "

