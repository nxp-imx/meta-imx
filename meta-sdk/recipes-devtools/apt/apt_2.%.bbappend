FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://debian-10.list"

do_install:append() {
    install -m 0644 ${WORKDIR}/debian-10.list ${D}${sysconfdir}/apt/sources.list.d/
}

inherit useradd

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "--system --no-create-home --home-dir /nonexistent --shell /bin/false --user-group _apt"
