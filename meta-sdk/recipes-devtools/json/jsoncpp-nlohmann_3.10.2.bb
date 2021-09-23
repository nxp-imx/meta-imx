SUMMARY = "JSON for Modern C++"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.MIT;md5=441793d25a658d58d79a1f87516a6ad1"

SRC_URI = "git://github.com/nlohmann/json.git;protocol=https"
SRCREV = "626e7d61e44dee32887126c8f437dd077dec09cf"

S = "${WORKDIR}/git"

inherit cmake

ALLOW_EMPTY_${PN} = "1"
