package org.iota

import org.iota.tangle.stream.messages.transactionMessages.UnconfirmedTransactionMessage

case class ReattachmentBundle(
                               hash: String,
                               amount: Long,
                               input: List[UnconfirmedTransactionMessage],
                               output: List[UnconfirmedTransactionMessage],
                               size: Int
                             ) extends TransactionBundle
