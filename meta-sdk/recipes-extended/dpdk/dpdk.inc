DESCRIPTION = "Intel(r) Data Plane Development Kit"
HOMEPAGE = "http://dpdk.org"

LICENSE = "BSD-3-Clause & LGPL-2.1-only & GPL-2.0-only"
LIC_FILES_CHKSUM = "file://license/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://license/lgpl-2.1.txt;md5=4b54a1fd55a448865a0b32d41598759d \
                    file://license/bsd-3-clause.txt;md5=0f00d99239d922ffd13cabef83b33444"

DPDK_SRC ?= "git://source.codeaurora.org/external/qoriq/qoriq-components/dpdk;protocol=https"
SRC_URI = "${DPDK_SRC};nobranch=1 \
"

STABLE = "-stable"

SRCREV = "fb18f98bbc4d02fbab1e103d2155922f62da2759"

CVE_PRODUCT = "data_plane_development_kit"
