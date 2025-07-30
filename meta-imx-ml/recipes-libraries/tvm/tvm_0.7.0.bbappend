FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRCBRANCH = "eiq-tvm-v0.7"
SRCREV = "4f710ec5796ac0eb0b0a23d3c808ca68e13173f6"

do_install () {
    cmake_do_install

    install -d ${D}${bindir}/${PN}-${PV}/examples
    # Install python example
    cp ${S}/tests/python/contrib/test_vsi_npu/label_image.py ${D}${bindir}/${PN}-${PV}/examples

    setuptools3_do_install
    rm -fr ${D}${datadir}

    # Install pkgconfig file for tvm_runtime lib
    install -d ${D}${libdir}/pkgconfig
    install -m 0644 ${UNPACKDIR}/tvm_runtime.pc.in ${D}${libdir}/pkgconfig/tvm_runtime.pc

    sed -i 's:@version@:${PV}:g
        s:@libdir@:${libdir}:g
        s:@includedir@:${includedir}:g' ${D}${libdir}/pkgconfig/tvm_runtime.pc

    # Install additional header files that tvm public interface depends on
    cd ${S}/3rdparty/dlpack/include
    cp --parents \
        $(find . -name "*.h*") \
        ${D}${includedir}

    cd ${S}/3rdparty/dmlc-core/include
    cp --parents \
        $(find . -name "*.h*") \
        ${D}${includedir}
}
