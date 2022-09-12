# Copyright 2021 NXP

DESCRIPTION = "Google Coral Edge TPU Posenet Library"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=55899200c3031a66eb11a57a52f7a75e"

DEPENDS = "tensorflow-lite flatbuffers"

GOOGLE_CORAL_POSENET_SRC ?= "git://github.com/nxp-imx/coral-posenet-imx.git;protocol=https"
SRCBRANCH = "lf-5.10.52_2.1.0"

SRC_URI = "${GOOGLE_CORAL_POSENET_SRC};branch=${SRCBRANCH} \
           git://github.com/google-coral/project-posenet.git;protocol=https;name=project-posenet;subpath=models;destsuffix=git/edgetpu/models \
"
SRCREV = "938fb3bc4e78d4eaa3cf91baceaa87893547fa55"
SRCREV_project-posenet = "58a611ed1135852b8e97a7626777a7304e8ecc21"

SRC_URI += "https://dl.google.com/coral/canned_models/all_models.tar.gz;name=canned-models;subdir=canned-models"
SRC_URI[canned-models.md5sum] = "432acbb54f0219f349a648c3af244731"
SRC_URI[canned-models.sha256sum] = "d93fc7165b81bc27cf05c19f7bd8d8ce71ccd9e8d92abef23ebc610fe38bbc3d"

inherit autotools

S = "${WORKDIR}/git/edgetpu"

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

do_install() {
    install -d ${D}${libdir}
    install -d ${D}${includedir}/posenet
    install -d ${D}${datadir}/gstnninferencedemo/google-coral/examples-camera
    install -d ${D}${datadir}/gstnninferencedemo/google-coral/project-posenet

    cp -d ${B}/.libs/libgooglecoraledgetpuposenet.so* ${D}${libdir}
    install -m 0644 ${S}/src/cpp/posenet/*.h ${D}${includedir}/posenet
    install -m 0644 ${WORKDIR}/canned-models/coco_labels.txt ${D}${datadir}/gstnninferencedemo/google-coral/examples-camera
    install -m 0644 ${WORKDIR}/canned-models/mobilenet_ssd_v2_coco_quant_postprocess.tflite ${D}${datadir}/gstnninferencedemo/google-coral/examples-camera
    install -m 0644 ${S}/models/mobilenet/posenet_mobilenet_v1_075_353_481_quant_decoder.tflite ${D}${datadir}/gstnninferencedemo/google-coral/project-posenet
}

FILES_${PN} += "${datadir}/gstnninferencedemo/*"
FILES_${PN} += "${libdir}"
