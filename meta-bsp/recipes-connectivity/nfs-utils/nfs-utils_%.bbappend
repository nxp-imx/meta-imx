do_install:append () {
    # If using systemd and NFSD is not configured in kernel then remove
    # the unnecessary files to avoid the failure massages at boot.
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        if [ "$(grep "CONFIG_NFSD" ${STAGING_KERNEL_BUILDDIR}/.config)" != "CONFIG_NFSD=m" ]; then
            if [ -f "${D}${sysconfdir}/modules-load.d/nfsd.conf" ]; then
               rm ${D}${sysconfdir}/modules-load.d/nfsd.conf
            fi
            if [ "$(grep "CONFIG_NFSD" ${STAGING_KERNEL_BUILDDIR}/.config)" != "CONFIG_NFSD=y" ]; then
                rm -f ${D}${systemd_unitdir}/system/sysinit.target.wants/proc-fs-nfsd.mount
                rm -f ${D}${systemd_unitdir}/system/proc-fs-nfsd.mount
            fi
        fi
    fi
}
