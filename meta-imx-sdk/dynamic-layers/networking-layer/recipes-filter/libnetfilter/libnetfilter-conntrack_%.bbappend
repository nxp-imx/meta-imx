FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append:imx-nxp-bsp = " \
    file://0001-cmm-ips_status_definitions.patch \
    file://0002-cmm-socket_buffer_size.patch \
    file://0003-cmm-comcerto_fp_info.patch \
    file://0004-cmm-do_not_deprecate_nfct_maxsize.patch \
"

