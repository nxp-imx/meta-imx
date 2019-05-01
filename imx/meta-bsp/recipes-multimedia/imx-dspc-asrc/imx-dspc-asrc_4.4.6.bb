# Copyright 2019 NXP
DESCRIPTION = "NXP Asynchronous Sample Rate Converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "a238712653e3344167d08fa62278bba2"
SRC_URI[sha256sum] = "66f5bb59759f4b37ad4832e3fc572e913fef48706ae9005d1cedae8ebc7e559d"

inherit fsl-eula-unpack autotools pkgconfig

EXTRA_OECONF = "--enable-armv8 --libdir=${libdir} --bindir=/unit_tests"

do_install_append() {
    # FIXME - Fix the package install so we don't have to fix it here
    # Extract the major version
    index=$(expr index ${PV} .)
    length=$(expr $index - 1)
    pv_major=$(expr substr ${PV} 1 $length)
    for lib in lib_dspc_asrc.so lib_dspc_asrc_coef.so; do
        mv ${D}${libdir}/$lib ${D}/${libdir}/$lib.${PV}
        ln -sf $lib.${PV} ${D}/${libdir}/$lib.$pv_major
        ln -sf $lib.${PV} ${D}/${libdir}/$lib
    done
}

FILES_${PN} += "/unit_tests ${datadir}"

COMPATIBLE_MACHINE = "(mx8)"

