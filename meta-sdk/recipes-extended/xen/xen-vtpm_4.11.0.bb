# Copyright (C) 2017 Kurt Bodiker <kurt.bodiker@braintrust-us.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "MiniOS-based vTPMs for Xen"
HOMEPAGE = "https://www.xenproject.org"
LICENSE = "GPLv2 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=b1ceb1b03a49b202ee6f41ffd1ed0155 \
                    file://vtpm/COPYING;md5=75a98062ab0322ded060d9026a1bda61 \
"

# git commit hash for Xen's RELEASE-4.11.0 tag
SRCREV_xen = "1eb6544a567e3e5133fafe0c4ef3545c5138d0e4"
SRC_URI = "\
    git://xenbits.xen.org/xen.git;protocol=git;nobranch=1;name=xen;subpath=stubdom \
    git://xenbits.xen.org/xen.git;protocol=git;nobranch=1;name=xen;destsuffix=stubdom/include;subpath=tools/xenstore/include \
"

S="${WORKDIR}/stubdom"
B="${S}"

require xen-vtpm.inc
