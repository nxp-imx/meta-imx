SUMMARY = "NXP RT-SDK ARA2"
DESCRIPTION = "Runtime SDK for AI/ML acceleration with Ara240 NPU on i.MX SoCs"
HOMEPAGE = "https://github.com/nxp-imx/rt-sdk-ara2"
LICENSE = "Proprietary & LGPL-2.1-or-later & Apache-2.0 & MIT & BSD-2-Clause & BSD-3-Clause & BSL-1.0"

LIC_FILES_CHKSUM = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM += "\
     file://usr/share/doc/rt-sdk-ara2/licenses/gstreamer-plugins-ara240/LICENSE.txt;md5=22ea34143b59cc3b12b8bf8b8ecebe88 \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/Apache-2.0.txt;md5=175792518e4ac015ab6696d16c4f607e \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/BSD-2-Clause_xxHash.txt;md5=eb59f7846f95bc2bd97b5a43d9532b51 \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/BSD-3-Clause_CLI11.txt;md5=ed2b4d21cf1d8147851ad87a279d4426 \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/BSD-3-Clause_googletest.txt;md5=b2ee6591406ecf2584ced033becbac14 \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/BSL-1.0.txt;md5=2c7a3fa82e66676005cd4ee2608fd7d2 \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/MIT_gabime_spdlog.txt;md5=89fc2280bff8926bfed3be10f111294d \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/MIT_jarro2783_cxxopts.txt;md5=e29481dccc228cd5a3a49da897d31f3c \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/MIT_jbeder_yaml-cpp.txt;md5=c1a6c0b805640a25f3b1a3727b33d96e \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/MIT_libuv_libuv.txt;md5=ea9d04ef06ca805fee88501c1f54897c \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/MIT_nlohmann_json.txt;md5=9bbb0c906780ff48a80ad56593bef693 \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/MIT_seleznevae_libfort.txt;md5=c22d997c54191cc213da40759baa010c \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/MIT_vthiery_cpp-statsd-client.txt;md5=5e042c32f4b43cdb9ceaf4496bbc33be \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/MIT_yaml_libyaml.txt;md5=b8fd75300a256f7a0376cbbce959d3cb \
     file://usr/share/doc/rt-sdk-ara2/licenses/proxy_ara240/MIT_yhirose_cpp-httplib.txt;md5=4e88dd136db8ee6e996709e995952f81"

require imx-nxp-ara2.inc

IMX_SRCREV_ABBREV = "05b99db"
SRC_URI[sha256sum] = "a90276d3a77be82d82329f8d746795627a45d593351bf2375fa5a6d4f57203bb"

inherit fsl-eula2-unpack2 fsl-eula-recent
