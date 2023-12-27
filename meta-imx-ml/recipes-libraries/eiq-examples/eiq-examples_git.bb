SUMMARY = "The eiq examples based on Tf-lite"
DESCRIPTION = "The eiq examples based on Tf-lite"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "${EIQ_EXAMPLES_SRC};branch=${SRCBRANCH}"
EIQ_EXAMPLES_SRC ?= "git://github.com/nxp-imx/eiq-example.git;protocol=https"
SRCBRANCH = "lf-6.6.3_1.0.0"
SRCREV = "501575f2d91baf24569bd96d313a4156b7dd724d"

S = "${WORKDIR}/git"

do_install () {
    # install scripts to /usr/bin
    install -d ${D}${bindir}/${PN}-${PV}/
    cp ${S}/download_models.py ${D}${bindir}/${PN}-${PV}/
    cp -r ${S}/dms ${D}${bindir}/${PN}-${PV}/
    cp -r ${S}/face_recognition ${D}${bindir}/${PN}-${PV}/
    cp -r ${S}/image_classification ${D}${bindir}/${PN}-${PV}/
    cp -r ${S}/object_detection ${D}${bindir}/${PN}-${PV}/
    cp -r ${S}/gesture_detection ${D}${bindir}/${PN}-${PV}/
}

RDEPENDS:${PN} = "python3 python3-numpy python3-pillow python3-requests \
                  python3-opencv python3-pillow tensorflow-lite"

#Only support imx93 currently, will add other plantform support.
COMPATIBLE_MACHINE = "(mx93-nxp-bsp)"
