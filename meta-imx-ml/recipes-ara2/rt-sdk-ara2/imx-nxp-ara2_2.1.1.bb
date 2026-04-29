SUMMARY = "NXP RT-SDK ARA2"
DESCRIPTION = "Runtime SDK for AI/ML acceleration with Ara240 NPU on i.MX SoCs"
HOMEPAGE = "https://bitbucket.sw.nxp.com/mag/meta-nxp-ara"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=04de690020b04714cd7cd6fb8f0b2fd9"

SRC_URI = "git://bitbucket.sw.nxp.com/mag/rt-sdk-ara2.git;branch=feature/building-bin-from-build-script;protocol=ssh"
SRCREV = "e95823c120ebb7f4fed675ae5eb4627e6542d3d0"
SRC_URI += "file://postinst.sh"

S = "${UNPACKDIR}/${BPN}-${PV}"

inherit python3native

do_compile() {
	export YOCTO_BUILD=1
    export PYTHONPATH="${STAGING_LIBDIR_NATIVE}/${PYTHON_DIR}/site-packages:${PYTHONPATH}"
	ln -sf makeself.sh ${STAGING_BINDIR_NATIVE}/makeself

    bash ${S}/build.sh
}

do_install() {
    # Disable pseudo for the extraction
    export PSEUDO_DISABLED=1
    # Extract the self-extracting package
    echo "Y" | sh ${S}/${BPN}-${PV}.bin --auto-accept
    unset PSEUDO_DISABLED

    install -d ${D}/
    cp -r ${S}/${BPN}-${PV}/etc ${D}/
    cp -r ${S}/${BPN}-${PV}/usr ${D}/

    install -d ${D}${datadir}/${BPN}
    install -m 0755 ${UNPACKDIR}/postinst.sh ${D}${datadir}/${BPN}/postinst.sh
}

DEPENDS = " \
    cmake-native \
    coreutils-native \
    chrpath-native \
    dpkg-native \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
	makeself-native \
    pkgconfig-native \
    python3 \
    python3-native \
    python3-pip-native \
    python3-build-native \
    python3-hatchling-native \
"

RDEPENDS:${PN} += " \
	uv \
    dbus \
    dbus-lib \
    libusb1 \
	gstreamer1.0 \
	uiodma-driver \
	eiq-aaf-connector \
"

FILES_SOLIBSDEV = ""
FILES:${PN} += " /* "

# Skip QA warning about .so files in non-dev package
INSANE_SKIP:${PN} += " dev-so already-stripped buildpaths rpaths"

pkg_postinst_ontarget:${PN}() {
    ${datadir}/${BPN}/postinst.sh
}

