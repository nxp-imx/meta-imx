SUMMARY = "The ARM Computer Vision and Machine Learning library"
DESCRIPTION = "The ARM Computer Vision and Machine Learning library is a set of functions optimised for both ARM CPUs and GPUs."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=762a7ba8d2ddc3b38d88742fbaf0b62d"

COMPATIBLE_MACHINE = "armv7a|aarch64"

SRC_URI = " \
    git://github.com/ARM-software/ComputeLibrary.git;branch=${BRANCH} \
    file://0001-add-ti-benchmark-test-group.patch \
    file://0002-add-ti-benchmark-test-group.patch \
    file://0003-add-ti-benchmark-test-group.patch \
    file://0004-add-ti-benchmark-test-group.patch \
    file://0005-add-ti-benchmark-test-group.patch \
    file://0006-add-ti-benchmark-test-group.patch \
    file://0007-add-ti-benchmark-test-group.patch \
    file://0008-add-ti-benchmark-test-group.patch \
    file://0009-add-ti-benchmark-test-group.patch \
    file://0010-add-ti-benchmark-test-group.patch \
    file://0011-add-ti-benchmark-test-group.patch \
"

PV = "18.08"
PV_MAJOR = "${@d.getVar('PV',d,1).split('.')[0]}"

BRANCH = "master"
SRCREV = "52ba29e936b8e711e8acdfe819e36f884d4f3fe1"

S = "${WORKDIR}/git"

do_compile_prepend() {
    sed -i 's/arm-linux-gnueabihf-/${TOOLCHAIN_SYS}-/' SConstruct
    sed -i 's/aarch64-linux-gnu-/${TOOLCHAIN_SYS}-/' SConstruct
    sed -i "s#env.Append(LINKFLAGS = \['-fopenmp'\])#env.Append(LINKFLAGS = \['-fopenmp','--sysroot=${STAGING_DIR_TARGET}'\])#" SConstruct
    unset CC CXX
}

inherit scons

EXTRA_OESCONS = "arch=armv7a extra_cxx_flags="-fPIC -Wno-unused-but-set-variable -Wno-ignored-qualifiers -Wno-noexcept ${TOOLCHAIN_OPTIONS}" benchmark_tests=1 validation_tests=0 neon=1 openmp=1 opencl=0 set_soname=1"
EXTRA_OESCONS_aarch64 = "arch=arm64-v8a extra_cxx_flags="-fPIC -Wno-unused-but-set-variable -Wno-ignored-qualifiers -Wno-noexcept ${TOOLCHAIN_OPTIONS}" benchmark_tests=1 validation_tests=0 neon=1 openmp=1 opencl=0 set_soname=1"

LIBS += "-larmpl_lp64_mp"

do_install() {
    CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"

    install -d ${D}${libdir}
    for lib in ${S}/build/*.so*
    do
        cp $CP_ARGS $lib ${D}${libdir}
    done

    # Install 'example' and benchmark executables
    install -d ${D}${bindir}
    find ${S}/build/examples/ -maxdepth 1 -type f -executable -exec cp $CP_ARGS {} ${D}${bindir} \;
    cp $CP_ARGS ${S}/build/tests/arm_compute_benchmark ${D}${bindir}

    # Install built source package as expected by ARMNN
    install -d ${D}${datadir}/${BPN}
    cp $CP_ARGS ${S}/arm_compute ${D}${datadir}/${BPN}/.
    cp $CP_ARGS ${S}/include ${D}${datadir}/${BPN}/.
    cp $CP_ARGS ${S}/support ${D}${datadir}/${BPN}/.
}

INSANE_SKIP_${PN} = "ldflags"
INSANE_SKIP_${PN}-dev = "dev-elf ldflags"

FILES_${PN}-source = "${datadir}/${BPN}"
INSANE_SKIP_${PN}-source = "ldflags libdir staticdev"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
