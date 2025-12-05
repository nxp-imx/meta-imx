FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRCBRANCH = "lf-6.12.49_2.2.0"
TVM_SRC ?= "git://github.com/nxp-imx/eiq-tvm-imx.git;protocol=https"
SRC_URI = "${TVM_SRC};branch=${SRCBRANCH}\
               git://github.com/dmlc/dlpack;protocol=https;nobranch=1;destsuffix=git/3rdparty/dlpack;name=dlpack \
               git://github.com/dmlc/dmlc-core;protocol=https;nobranch=1;destsuffix=git/3rdparty/dmlc-core;name=dmlc-core \
               git://github.com/agauniyal/rang;protocol=https;nobranch=1;destsuffix=git/3rdparty/rang;name=rang \
               git://github.com/apache/incubator-tvm-vta;protocol=https;nobranch=1;destsuffix=git/3rdparty/vta-hw;name=vta-hw \
               file://0001-tvm-CMakeLists.txt-Use-CMAKE-variables-for-libs-inst.patch \
               file://tvm_runtime.pc.in \
"
SRCREV = "f6fe9c9388fe7af3f7f18ddff426bacb9aaf7a5a"

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
