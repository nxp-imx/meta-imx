SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "c8f3fa5c2fcdfca41cdb3b84782957db"
SRC_URI[sha256sum] = "33f6ad85b81473874729c2d2cadd085e149c248c02d8ac358d119c6ed8a6535a"

# remove g2d for non SX and SL builds
do_configure () {
     rm -rf ${S}/g2d
}
