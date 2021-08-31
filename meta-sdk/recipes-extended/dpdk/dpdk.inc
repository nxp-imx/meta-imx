DESCRIPTION = "Intel(r) Data Plane Development Kit"
HOMEPAGE = "http://dpdk.org"

LICENSE = "BSD-3-Clause & LGPLv2.1 & GPLv2"
LIC_FILES_CHKSUM = "file://license/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://license/lgpl-2.1.txt;md5=4b54a1fd55a448865a0b32d41598759d \
                    file://license/bsd-3-clause.txt;md5=0f00d99239d922ffd13cabef83b33444"

DPDK_SRC ?= "git://source.codeaurora.org/external/qoriq/qoriq-components/dpdk;protocol=https"
SRC_URI = "${DPDK_SRC};nobranch=1 \
           file://0001-meson.build-march-and-mcpu-already-passed-by-Yocto.patch \
           file://0001-ifpga-meson-Fix-finding-librt-using-find_library.patch \
"

STABLE = "-stable"

SRCREV = "ffc08d9998c962d5716ae3a63044ab08d9f51d86"

CVE_PRODUCT = "data_plane_development_kit"
