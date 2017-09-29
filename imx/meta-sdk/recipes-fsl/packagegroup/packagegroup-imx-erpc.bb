# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX package group - embedded RPC"
DESCRIPTION = "Contains the modules needed by eRPC."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

RDEPENDS_${PN} = " \
    python-erpc \
"
