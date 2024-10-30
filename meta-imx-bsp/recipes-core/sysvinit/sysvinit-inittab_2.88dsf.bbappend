# Freescale imx extra configuration 
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

RDEPENDS:${PN} += " bash "

SYSVINIT-GPU = " file://rc_mxc.S file://rc_gpu.S"

SRC_URI:append:imxgpu2d  = " ${SYSVINIT-GPU}"

do_install:append:imxgpu2d() {
    # Install rc_mxc.S to /etc/init.d
    install -d ${D}${sysconfdir} ${D}${sysconfdir}/init.d
    install -m 0755 ${UNPACKDIR}/rc_mxc.S ${D}${sysconfdir}/init.d

    echo "mxc::respawn:/etc/init.d/rc_mxc.S" >> ${D}${sysconfdir}/inittab

    # Install rc_gpu.S to /etc/init.d
    install -m 0755 ${UNPACKDIR}/rc_gpu.S ${D}${sysconfdir}/init.d

    echo "gpu::sysinit:/etc/init.d/rc_gpu.S" >> ${D}${sysconfdir}/inittab
}

FILES:${PN}:append:imxgpu2d = " ${sysconfdir}/init.d/rc_mxc.S ${sysconfdir}/init.d/rc_gpu.S"

PACKAGE_ARCH:imxgpu2d = "${MACHINE_ARCH}"
