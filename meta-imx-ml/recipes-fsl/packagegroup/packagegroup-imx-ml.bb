# Copyright 2019-2026 NXP
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
    litert \
    onnxruntime-tests \
    pytorch \
    tensorflow-lite \
"
ML_PKGS:mx9-nxp-bsp = " \
    litert \
    onnxruntime-tests \
    pytorch \
    tensorflow-lite \
"
# These packages require acceleration, which currently maps to
# all SOCs with GPU except for 8M Mini
ML_ACCELERATED_PKGS                    = ""
ML_ACCELERATED_PKGS:mx8-nxp-bsp:imxgpu = " \
    litert-vx-delegate \
    tensorflow-lite-vx-delegate \
"
ML_ACCELERATED_PKGS:mx8mp-nxp-bsp      = " \
    litert-vx-delegate \
    tensorflow-lite-vx-delegate \
    tvm \
"
ML_ACCELERATED_PKGS:mx8mm-nxp-bsp      = ""


# ARM ethos-u package
ETHOS_U_PKGS = ""
ETHOS_U_PKGS:mx93-nxp-bsp = " \
    ethos-u-vela \
    ethos-u-driver-stack \
    litert-ethosu-delegate \
    tensorflow-lite-ethosu-delegate \
    eiq-examples \
"

# Neutron package
NEUTRON_PKGS = ""
NEUTRON_PKGS:mx943-nxp-bsp = " \
    litert-neutron-delegate \
    neutron \
    tensorflow-lite-neutron-delegate \
    eiq-examples-npu-utils \
"
NEUTRON_PKGS:mx95-nxp-bsp = " \
    litert-neutron-delegate \
    neutron \
    tensorflow-lite-neutron-delegate \
    eiq-examples-npu-utils \
"

# Ara240 package
ARA240_PKGS = ""
ARA240_PKGS:append:imx8mp-lpddr4-frdm = " imx-nxp-ara2"
ARA240_PKGS:append:imx95-15x15-lpddr4x-frdm = " imx-nxp-ara2"
ARA240_PKGS:append:imx95-19x19-lpddr5-frdm-pro = " imx-nxp-ara2"

RDEPENDS:${PN} = " \
    ${ML_PKGS} \
    ${ML_ACCELERATED_PKGS} \
    ${ML_NNSTREAMER_PKGS} \
    ${ML_GST_PROFILER} \
    ${ETHOS_U_PKGS} \
    ${NEUTRON_PKGS} \
    ${ARA240_PKGS} \
"
