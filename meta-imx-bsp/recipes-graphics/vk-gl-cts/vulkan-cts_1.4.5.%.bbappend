FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://0001-Avoid-algebraic-cancellation-in-mat_det-and-cross.patch \
    file://0002-Fix-absolute-PresentAt-base-stage-selection.patch"
