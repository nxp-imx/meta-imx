# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

inherit fsl-vivante-kernel-driver-handler

IMX_UAPI_HEADERS = "mxc_asrc.h mxc_dcic.h mxcfb.h mxc_mlb.h mxc_sim_interface.h \
                    mxc_v4l2.h ipu.h videodev2.h pxp_device.h pxp_dma.h isl29023.h"

MORE_UAPI_HEADERS = "ion.h"

do_install_append () {
   # Install i.MX specific uapi headers
   oe_runmake headers_install INSTALL_HDR_PATH=${B}${exec_prefix}
   install -d ${D}${exec_prefix}/include/linux
   for UAPI_HDR in ${IMX_UAPI_HEADERS}; do
       find ${B}${exec_prefix}/include -name ${UAPI_HDR} -exec cp {} ${D}${exec_prefix}/include/linux \;
       ls ${D}${exec_prefix}/include/linux
       echo "copy ${UAPI_HDR} done"
   done
}

do_install_append () {
   # Install some additional uapi headers
   install -d ${D}${exec_prefix}/include/linux
   for UAPI_HDR in ${MORE_UAPI_HEADERS}; do
       find ${STAGING_KERNEL_DIR} -path '*uapi*' -name ${UAPI_HDR} -exec cp {} ${D}${exec_prefix}/include/linux \;
       ls ${D}${exec_prefix}/include/linux
       echo "copy ${UAPI_HDR} done"
   done
}

sysroot_stage_all_append () {
    # FIXME: Remove videodev2.h as conflict with linux-libc-headers
    find ${D}${exec_prefix}/include -name videodev2.h -exec mv {} ${B} \;
    # Install SOC related uapi headers to sysroot
    sysroot_stage_dir ${D}${exec_prefix}/include ${SYSROOT_DESTDIR}${exec_prefix}/include
    # FIXME: Restore videodev2 back
    if [ -e ${B}/videodev2.h ]; then
        mv ${B}/videodev2.h ${D}${exec_prefix}/include/linux/
    fi
}

PACKAGES += "${PN}-soc-headers"
FILES_${PN}-soc-headers = "${exec_prefix}/include"

# support for systemd
do_configure_append () {
    echo "CONFIG_FHANDLE=y" >>  ${B}/.config
}
