SUMMARY = "Architecture-dependent configuration for opkg"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PACKAGE_ARCH = "${MACHINE_ARCH}"
PR = "r1"

S = "${WORKDIR}"

do_compile() {
    mkdir -p ${S}/${sysconfdir}/opkg/

    feedconf=${S}/${sysconfdir}/opkg/base-feed.conf

    rm -f $feedconf
    ipkgarchs="${ALL_MULTILIB_PACKAGE_ARCHS}"
    for arch in $ipkgarchs; do
        echo "src/gz $arch ${FEED_DEPLOYDIR_BASE_URI}/$arch" >> $feedconf
    done
}


do_install () {
    install -d ${D}${sysconfdir}/opkg
    install -m 0644  ${S}/${sysconfdir}/opkg/* ${D}${sysconfdir}/opkg/
}

FILES_${PN} = "${sysconfdir}/opkg/ "

CONFFILES_${PN} += "${sysconfdir}/opkg/base-feed.conf"

RREPLACES_${PN} = "opkg-config-base"
RCONFLICTS_${PN} = "opkg-config-base"
RPROVIDES_${PN} = "opkg-config-base"
