# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Add packages for AI/ML build"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

inherit packagegroup

ML_NNSTREAMER_PKGS_LIST = " \
    nnstreamer \
    nnstreamer-protobuf \
    nnstreamer-python3 \
    nnstreamer-query \
    nnstreamer-tensorflow-lite \
"

ML_NNSTREAMER_PKGS = ""
ML_NNSTREAMER_PKGS:mx8-nxp-bsp:imxgpu = "${ML_NNSTREAMER_PKGS_LIST}"
ML_NNSTREAMER_PKGS:mx8mp-nxp-bsp      = "${ML_NNSTREAMER_PKGS_LIST} nnstreamer-tvm nnstreamer-unittest"
ML_NNSTREAMER_PKGS:mx9-nxp-bsp        = "${ML_NNSTREAMER_PKGS_LIST}"

# i.MX8MP uses nnshark - other i.MX8/9 use raw gstshark
ML_GST_PROFILER = ""
ML_GST_PROFILER:mx8-nxp-bsp   = "gst-shark"
ML_GST_PROFILER:mx8mp-nxp-bsp = "nnshark"
ML_GST_PROFILER:mx9-nxp-bsp   = "gst-shark"

# These packages don't require any acceleration
ML_PKGS            = ""
ML_PKGS:mx8-nxp-bsp = " \
    arm-compute-library \
    onnxruntime-tests \
    tensorflow-lite \
    torchvision \
"
ML_PKGS:mx9-nxp-bsp = " \
    arm-compute-library \
    onnxruntime-tests \
    tensorflow-lite \
    torchvision \
"
# These packages require acceleration, which currently maps to
# all SOCs with GPU except for 8M Mini
ML_ACCELERATED_PKGS                    = ""
ML_ACCELERATED_PKGS:mx8-nxp-bsp:imxgpu = " \
    tensorflow-lite-vx-delegate \
"
ML_ACCELERATED_PKGS:mx8mp-nxp-bsp      = " \
    tensorflow-lite-vx-delegate \
    tvm \
"
ML_ACCELERATED_PKGS:mx8mm-nxp-bsp      = ""


# ARM ethos-u package
ETHOS_U_PKGS = ""
ETHOS_U_PKGS:mx93-nxp-bsp = " \
    ethos-u-vela \
    ethos-u-driver-stack \
    tensorflow-lite-ethosu-delegate \
    eiq-examples \
"

# Neutron package
NEUTRON_PKGS = ""
NEUTRON_PKGS:mx95-nxp-bsp = " \
    neutron \
    tensorflow-lite-neutron-delegate \
"

RDEPENDS:${PN} = " \
    ${ML_PKGS} \
    ${ML_ACCELERATED_PKGS} \
    ${ML_NNSTREAMER_PKGS} \
    ${ML_GST_PROFILER} \
    ${ETHOS_U_PKGS} \
    ${NEUTRON_PKGS} \
"
