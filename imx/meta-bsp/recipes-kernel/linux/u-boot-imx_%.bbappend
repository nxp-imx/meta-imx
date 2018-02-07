FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-OPTEE-update-fdt-string-in-case-of-tee.patch"
