
PRINC := "${@int(PRINC) + 1}"

# look for files in the layer first
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"


# Remove memcpy_neon and memcpy_vfp for armv7 as performance drop on Cortex-A9
SRC_URI_append_mx6 = " file://eglibc_2.19_remove_memcpy_neon_vfp.patch \
"

