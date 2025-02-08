FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append:mx943-nxp-bsp() {
    mkdir -p ${D}${sysconfdir}/connman
    cp ${S}/main.conf ${D}${sysconfdir}/connman/main.conf
}
